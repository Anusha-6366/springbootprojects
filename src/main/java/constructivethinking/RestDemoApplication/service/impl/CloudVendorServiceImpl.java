//package constructivethinking.RestDemoApplication.service.impl;
//
//import constructivethinking.RestDemoApplication.model.CloudVendorApiModel;
//import constructivethinking.RestDemoApplication.repository.CloudvendorRepository;
//import constructivethinking.RestDemoApplication.service.CloudVendorService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//public class CloudVendorServiceImpl implements CloudVendorService {
//
//    CloudvendorRepository cloudvendorRepository;
//    public CloudVendorServiceImpl(CloudvendorRepository cloudvendorRepository) {
//        this.cloudvendorRepository = cloudvendorRepository;
//    }
//    @Override
//    public String createCloudVendor(CloudVendorApiModel cloudvendor) {
//       cloudvendorRepository.save(cloudvendor);
//       return "Success";
//    }
//
//    @Override
//    public String updateCloudVendor(CloudVendorApiModel cloudvendor) {
//        cloudvendorRepository.save(cloudvendor);
//        return "updated";
//    }
//
//    @Override
//    public String delCloudVendor(String id) {
//        cloudvendorRepository.deleteById(id);
//        return "deleted" + id;
//    }
//
//    @Override
//    public CloudVendorApiModel getCloudVendor(String id) {
//        return cloudvendorRepository.findById(id).get();
//    }
//
//    @Override
//    public List<CloudVendorApiModel> getAllCloudVendors() {
//        return cloudvendorRepository.findAll();
//    }
//}
//
//
