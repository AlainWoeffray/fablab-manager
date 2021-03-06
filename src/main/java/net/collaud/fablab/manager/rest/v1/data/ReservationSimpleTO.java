package net.collaud.fablab.manager.rest.v1.data;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import net.collaud.fablab.manager.data.MachineEO;
import net.collaud.fablab.manager.data.ReservationEO;
import net.collaud.fablab.manager.data.UserEO;

/**
 *
 * @author Gaetan Collaud <gaetancollaud@gmail.com>
 */
@Getter
@Setter
public class ReservationSimpleTO extends AbstractTO<ReservationEO, ReservationSimpleTO> {

	private Long id;

	private Date dateStart;

	private Date dateEnd;

	private UserSimpleTO user;

	private Long machineId;

	public ReservationSimpleTO() {
	}

	@Override
	public ReservationEO convertToEO() {
		ReservationEO eo = new ReservationEO();
		eo.setId(getId());
		eo.setDateStart(getDateStart());
		eo.setDateEnd(getDateEnd());
		eo.setMachine(new MachineEO(getMachineId()));
		eo.setUser(new UserEO(getUser().getId()));
		return eo;
	}

	@Override
	public ReservationSimpleTO fromEO(ReservationEO eo) {
		setId(eo.getId());
		setDateStart(eo.getDateStart());
		setDateEnd(eo.getDateEnd());
		setUser(new UserSimpleTO().fromEO(eo.getUser()));
		setMachineId(eo.getMachine().getId());
		return this;
	}


}
