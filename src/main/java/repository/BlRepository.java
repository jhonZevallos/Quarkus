package repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import model.BlModel;

@ApplicationScoped
public class BlRepository implements PanacheRepository<BlModel> {
}
