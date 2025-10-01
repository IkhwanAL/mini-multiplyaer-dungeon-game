
package com.project.mini_multiplyaer_dungeon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.mini_multiplyaer_dungeon.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{}
