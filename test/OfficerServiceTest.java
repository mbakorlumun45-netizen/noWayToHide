import com.lastma.data.models.Officer;
import com.lastma.data.repositories.DriverRepositoryImpl;
import com.lastma.data.repositories.OfficerRepositoryImpl;
import com.lastma.services.DriverService;
import com.lastma.services.OfficerService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OfficerServiceTest {
        @Test
        public void tesstThatWhenNoOfficerIsRegistered_countIsZero() {
            OfficerRepositoryImpl repository = new OfficerRepositoryImpl();
            OfficerService service = new OfficerService(repository);

            assertEquals(0L, service.countOfficerss());
        }
}
