package constructivethinking.RestDemoApplication.Controller;


import com.sun.source.tree.ReturnTree;
import constructivethinking.RestDemoApplication.model.CloudVendorApiModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorApiController {

    CloudVendorApiModel cloudVendorApiModel;

    @GetMapping("{id}")
    public CloudVendorApiModel getCloudVendorApiDetails(String id) {
        //return new CloudVendorApiModel("cloud1","vendor1","vendoraddress1","abcd");
        return cloudVendorApiModel;
    }
    @PostMapping
     public String getVendorDetails(@RequestBody CloudVendorApiModel cloudVendorApiModel){
        this.cloudVendorApiModel=cloudVendorApiModel;
        return "successfully connected";
     }
     @PutMapping
     public String updateVendorDetails(@RequestBody CloudVendorApiModel cloudVendorApiModel)//THE REQUEST WILL BE TAKEN FROM THE USER
     {
        this.cloudVendorApiModel=cloudVendorApiModel;
         return "updated successfully";
     }
     @DeleteMapping("{id}")
    public String dVendorDetails(String id){
        this.cloudVendorApiModel=null;
        return "del successfully";
    }

}

