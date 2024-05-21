package model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "crg_bills_of_lading",schema = "dbo")
public class BlModel extends PanacheEntityBase {

    @Id
    @Column(name = "gkey")
    private Long gkey;

    @Column(name = "nbr")
    private String nbr;

    @Column(name = "gid")
    private Long gid;

    @Column(name = "category")
    private String category;

    @Column(name = "manifested_qty")
    private Float manifestedQty;

    @Column(name = "complex_gkey")
    private Long complexGkey;

    @Column(name = "line_gkey")
    private Long lineGkey;

    @Column(name = "shipper_gkey")
    private Long shipperGkey;

    @Column(name = "cv_gkey")
    private Long cvGkey;

    @Column(name = "pol_gkey")
    private Long polGkey;

    @Column(name = "pod1_gkey")
    private Long pod1Gkey;

    @Column(name = "pod2_gkey")
    private Long pod2Gkey;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "creator")
    private String creator;

    @Column(name = "changed")
    private LocalDateTime changed;

    @Column(name = "changer")
    private String changer;

    @Column(name = "flex_string01")
    private String flexString1;

    @Column(name = "flex_string02")
    private String flexString2;

    @Column(name = "flex_string03")
    private String flexString3;

    @Column(name = "flex_string04")
    private String flexString4;

    @Column(name = "flex_string05")
    private String flexString5;
}