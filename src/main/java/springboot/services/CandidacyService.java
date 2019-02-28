package springboot.services;

import springboot.controllers.CandidacyDTO;
import springboot.models.Candidacy;
import springboot.models.User;

import java.util.List;

public interface CandidacyService {
    List<Candidacy> listAllCand();
    void deleteById(String id);
    List<User> listApplicants(String id);
    Candidacy save(CandidacyDTO cand);
}
