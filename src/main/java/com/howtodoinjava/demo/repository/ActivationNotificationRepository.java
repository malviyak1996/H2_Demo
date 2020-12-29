package com.howtodoinjava.demo.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.howtodoinjava.demo.model.ActivationNotificationEntity;
import com.howtodoinjava.demo.model.EmployeeEntity;

public interface ActivationNotificationRepository extends JpaRepository<ActivationNotificationEntity, Long> {

	 @Query("SELECT t FROM ActivationNotificationEntity t WHERE t.id in (:activationNotificationId)")
	  List<ActivationNotificationEntity> getActivationNotificationsById(Long activationNotificationId);
	 
	 @Modifying
	  @Transactional
	  @Query(
	      "update ActivationNotificationEntity entity set entity.activationStatus = ?1 where entity.id =?2")
	  void updateNotificationStatus(
	      String activationStatus,
	      Long activateNotificationId );
}
