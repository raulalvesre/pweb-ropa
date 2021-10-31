package pweb.ropa.service;

import pweb.ropa.dto.NewUserRequest;
import pweb.ropa.dto.UserResponse;

public interface UserService {

    UserResponse getById(long userId) throws Exception;
    UserResponse createUser(NewUserRequest newUserRequest) throws Exception;
    void deleteUser(long userId) throws Exception;

    boolean isEmailAlreadyRegistered(String email);
    boolean isCpfAlreadyRegistered(String cpf);
    boolean isTelephoneAlreadyRegistered(String telephone);
}
