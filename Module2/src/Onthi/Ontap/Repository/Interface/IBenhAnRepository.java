package Onthi.Ontap.Repository.Interface;

import Onthi.Ontap.Model.BenhAn;

import java.util.List;

public interface IBenhAnRepository {
   void add(BenhAn benhAn);
   List display();
   List find();
   void delete(int id);


}
