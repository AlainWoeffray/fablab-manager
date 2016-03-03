package net.collaud.fablab.manager.service.impl;

import java.util.List;
import java.util.Optional;
import net.collaud.fablab.manager.dao.ProjectRepository;
import net.collaud.fablab.manager.data.ProjectEO;
import net.collaud.fablab.manager.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Gaetan Collaud <gaetancollaud@gmail.com>
 */
@Service
@Transactional
public class ProjectServiceImpl extends AbstractServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	//FIXME roles
	public List<ProjectEO> findAll() {
		return projectRepository.findAll();
	}

	@Override
	public Optional<ProjectEO> getById(Long id) {
		return Optional.ofNullable(projectRepository.findOneWithDescription(id));
	}

	@Override
	public ProjectEO save(ProjectEO entity) {
		return projectRepository.save(entity);
	}

	@Override
	public void remove(Long id) {
		projectRepository.delete(id);
	}
}
