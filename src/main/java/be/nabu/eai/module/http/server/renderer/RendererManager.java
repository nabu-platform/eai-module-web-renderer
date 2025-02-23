/*
* Copyright (C) 2017 Alexander Verbruggen
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Lesser General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

package be.nabu.eai.module.http.server.renderer;

import be.nabu.eai.repository.api.Repository;
import be.nabu.eai.repository.managers.base.JAXBArtifactManager;
import be.nabu.libs.resources.api.ResourceContainer;

public class RendererManager extends JAXBArtifactManager<RendererConfiguration, RendererArtifact> {

	public RendererManager() {
		super(RendererArtifact.class);
	}

	@Override
	protected RendererArtifact newInstance(String id, ResourceContainer<?> container, Repository repository) {
		return new RendererArtifact(id, container, repository);
	}

}
