/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
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
package com.wenping.domain.interactor;

import com.wenping.domain.executor.PostExecutionThread;
import com.wenping.domain.executor.ThreadExecutor;
import com.wenping.domain.repository.UserRepository;

import javax.inject.Inject;

import rx.Observable;

/**
 * This class is an implementation of {@link UserCase} that represents a use case for
 * retrieving a collection of all {@link com.wenping.domain.User}.
 */
public class GetUserList extends UserCase {

    private final UserRepository userRepository;

    @Inject
    public GetUserList(UserRepository userRepository, ThreadExecutor threadExecutor,
                       PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.userRepository = userRepository;
    }

    /**
     * 获取用户列表
     * @return  Observable<List<User>>
     */
    @Override
    public Observable buildUseCaseObservable() {
        return this.userRepository.users();
    }
}
