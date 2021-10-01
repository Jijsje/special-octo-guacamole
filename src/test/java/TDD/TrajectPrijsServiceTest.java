package TDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TrajectPrijsServiceTest{

    private TrajectNaarTrajectEenhedenService eenhedenService = mock(TrajectNaarTrajectEenhedenService.class);
    private TrajectEenhedenNaarPrijsService prijsService = mock(TrajectEenhedenNaarPrijsService.class);
    TrajectPrijsService tps;

    @BeforeEach
    void setUp() {
        tps = new TrajectPrijsService();
        tps.setEenhedenService(eenhedenService);
        tps.setPrijsService(prijsService);
    }


    @Test
    void testGetTrajectPrijs1() throws TrajectNaarTrajectEenhedenService.InvalidLocationException {
        when(eenhedenService.getTrajectEenheden(anyString(), anyString())).thenReturn(9);
        when(prijsService.getPriceTrajectEenheden(anyInt())).thenReturn(86);
        assertEquals(86, tps.getTrajectPrijs("Haarlem", "Almere"));
    }

    @Test
    void testGetTrajectPrijs2() throws TrajectNaarTrajectEenhedenService.InvalidLocationException {
        when(eenhedenService.getTrajectEenheden(anyString(), eq("Neverland"))).thenThrow(TrajectNaarTrajectEenhedenService.InvalidLocationException.class);
        when(prijsService.getPriceTrajectEenheden(anyInt())).thenReturn(86);
        assertThrows(TrajectNaarTrajectEenhedenService.InvalidLocationException.class, () -> eenhedenService.getTrajectEenheden("London", "Neverland"));
    }
}