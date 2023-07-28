package in.onesoft.shop;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity.BodyBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/")
public class ImageController {
@Autowired
ImageRepository imagerepo;
    
    @GetMapping("/hello")
     public String message() {
    	
    	return "this is image ";
    } 
    @GetMapping(path = { "/get/id" })
    
        public ImageEntity getImage(@PathVariable("id") int id) throws IOException {
    
            final Optional<ImageEntity> retrievedImage = imagerepo.findById(id);
    
            ImageEntity img = new ImageEntity(retrievedImage.get().getName(), retrievedImage.get().getType(),
    
                    decompressBytes(retrievedImage.get().getPicByte()));
    
            return img;
    
        }
    
        // compress the image bytes before storing it in the database
   
        public static byte[] compressBytes(byte[] data) {
    
            Deflater deflater = new Deflater();
    
            deflater.setInput(data);
    
            deflater.finish();
    
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
   
            byte[] buffer = new byte[1024];
    
            while (!deflater.finished()) {
    
               int count = deflater.deflate(buffer);
                    outputStream.write(buffer, 0, count);
    
            }
    
            try {
   
                outputStream.close();
    
            } catch (IOException e) {
    
            }
   
            System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);
   
            return outputStream.toByteArray();
    
        }
    
    
        // uncompress the image bytes before returning it to the angular application
    
        public static byte[] decompressBytes(byte[] data) {
    
            Inflater inflater = new Inflater();
    
            inflater.setInput(data);
    
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
    
            byte[] buffer = new byte[1024];
    
            try {
    
                while (!inflater.finished()) {
    
                    int count = inflater.inflate(buffer);
    
                    outputStream.write(buffer, 0, count);
    
                }
    
                outputStream.close();
   
            } catch (IOException ioe) {
    
            } catch (DataFormatException e) {
    
            }
    
            return outputStream.toByteArray();
    
        }
    
    }


   
   
    
    
    
    
    
