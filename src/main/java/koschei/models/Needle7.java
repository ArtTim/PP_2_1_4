package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("needle")
public class Needle7 {
    private Deth8 deth;

    @Autowired
    public Needle7(@Qualifier("deth") Deth8 deth) {
        this.deth = deth;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( ";
    }
}
