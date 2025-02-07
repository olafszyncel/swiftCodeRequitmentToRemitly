package dev.ainz.swiftCodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SwiftService {

    @Autowired
    private SwiftRepository swiftRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    // endpoint 1
    public List<Swift> singleSwiftCode(String swiftCode) {
        if(swiftCode.substring(8).equals("XXX")){
            swiftCode = swiftCode.substring(0, swiftCode.length() - 3);
        }
        return swiftRepository.findSwiftBySwiftCodeStartingWith(swiftCode);
    }

    // endpoint 2
    public List<Swift> countrySwiftCode(String countryIso2Code) {
        return swiftRepository.findSwiftByCountryIso2Code(countryIso2Code);
    }

    //endpoint 3
    public Swift createSwiftCode(SwiftRequestDTO request) {
        List<Swift> existingSwift = swiftRepository.findSwiftBySwiftCodeStartingWith(request.getSwiftCode());

        if(existingSwift.isEmpty()){
            throw new RuntimeException("SWIFT Code already exists");
        }

        Swift swift = new Swift(
                request.getAddress(),
                request.getBankName(),
                request.getCountryISO2(),
                request.getCountryName(),
                request.getSwiftCode());
        return swiftRepository.save(swift);
    }

    // endpoint 4
    public boolean deleteSwiftCode(String swiftCode) {
        List<Swift> existingSwift = swiftRepository.findSwiftBySwiftCodeStartingWith(swiftCode);
        if(existingSwift.isEmpty()){
            return false;
        }
        swiftRepository.deleteSwiftBySwiftCode(swiftCode);
        return true;
    }



}
