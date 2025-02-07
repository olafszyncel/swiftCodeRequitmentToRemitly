package dev.ainz.swiftCodes;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SwiftRepository extends MongoRepository<Swift, String> {
    List<Swift> findSwiftBySwiftCodeStartingWith(String swiftCode);
    List<Swift> findSwiftByCountryIso2Code(String countryIso2Code);
    void deleteSwiftBySwiftCode(String swiftCode);
}
