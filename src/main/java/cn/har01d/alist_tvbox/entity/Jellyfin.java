package cn.har01d.alist_tvbox.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@TableGenerator(name = "tableGenerator", table = "id_generator", pkColumnName = "entity_name", valueColumnName = "next_id", allocationSize = 1)
public class Jellyfin {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tableGenerator")
    private Integer id;

    @Column(name = "`order`")
    private Integer order;
    private String name;
    private String url;
    private String userAgent;
    private String username = "";
    private String password = "";
    private String clientName;
    private String clientVersion;
    private String deviceId;
    private String deviceName;
}
