package Clinic.ClinicStaff.VetService;

import Clinic.ClinicStaff.VetService.VetService;
import Clinic.ClinicStaff.VetService.VetServiceImpl;
import Clinic.Data.DataBase;
import Clinic.Data.DataBaseImpl;

public class Registration {
    public static VetService getVetService() {
        return VetServiceImpl.getInstance();
    }

    public static DataBase getDataBase() {
        return DataBaseImpl.getInstance();
    }
}
