package com.hasni.tranquil.service;

import com.hasni.tranquil.model.Role;
import com.hasni.tranquil.model.User;

import java.util.List;

/**
 * @author Hasni
 */

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
