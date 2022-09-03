package com.utkarsh.medicine.prescriptor.Controller;

import com.utkarsh.medicine.prescriptor.Objects.Medicine;
import com.utkarsh.medicine.prescriptor.Service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicineController {

     @Autowired
    MedicineService medicineService;



     @GetMapping("/medicine/{id}")
    public Medicine findmedicine(@PathVariable Long id , Model model){
         Medicine medicine = medicineService.findMedicineById(id);
         model.addAttribute(medicine);
       return medicine;

     }

     @GetMapping("/medicine/findall")
     public List<Medicine> findAll(Model model){
         List<Medicine> medicine = medicineService.showAllMedicine();
         model.addAttribute(medicine);
         return medicine;
     }
}
