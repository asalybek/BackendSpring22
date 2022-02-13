package com.example.practical2.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantInventoryItemRepository extends JpaRepository<PlantInventoryItem, Long> {
    PlantInventoryItem findOneByPlantInfo(PlantInventoryEntry entry);
}
