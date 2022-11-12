package folder.middle.blockr;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
    @Table(name = "bazad")
    public class Baza {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String name;
        private int timers;

        public Baza() {
        }

        public Baza(Long id, String name, int timers) {

            this.id = id;
            this.name = name;
            this.timers = timers;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTimers() {
            return timers;
        }

        public void setTimers(int timers) {
            this.timers = timers;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 79 * hash + Objects.hashCode(this.id);
            hash = 79 * hash + Objects.hashCode(this.name);
            hash = 79 * hash + this.timers;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Baza other = (Baza) obj;
            if (this.timers != other.timers) {
                return false;
            }
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            return Objects.equals(this.id, other.id);
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Bazz{");
            sb.append("id=").append(id);
            sb.append(", name='").append(name).append('\'');
            sb.append(", timers=").append(timers);
            sb.append('}');
            return sb.toString();
        }
    }

