/**
 * Copyright 2019 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.thierrysquirrel.core.thread.execution;

import com.github.thierrysquirrel.core.thread.AbstractRemoveOldDataInitThread;
import com.github.thierrysquirrel.service.OtterRepositoryService;

/**
 * ClassName: RemoveOldDataInitThreadExecution
 * Description:
 * date: 2020/1/3 22:47
 *
 * @author ThierrySquirrel
 * @since JDK 1.8
 */
public class RemoveOldDataInitThreadExecution extends AbstractRemoveOldDataInitThread {
	public RemoveOldDataInitThreadExecution(Integer removeOldDataTime, Integer removeOldDataNumber, OtterRepositoryService otterRepositoryService) {
		super(removeOldDataTime, removeOldDataNumber, otterRepositoryService);
	}

	@Override
	protected void removeOldDataInit(Integer removeOldDataTime, Integer removeOldDataNumber, OtterRepositoryService otterRepositoryService) {
		otterRepositoryService.removeOldData(removeOldDataTime, removeOldDataNumber);
	}
}
