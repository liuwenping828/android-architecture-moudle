package com.wenping.domain.interactor;

import com.wenping.domain.executor.PostExecutionThread;
import com.wenping.domain.executor.ThreadExecutor;
import com.wenping.domain.repository.UserRepository;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GetUserList_Factory implements Factory<GetUserList> {
  private final MembersInjector<GetUserList> membersInjector;
  private final Provider<UserRepository> userRepositoryProvider;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;

  public GetUserList_Factory(MembersInjector<GetUserList> membersInjector, Provider<UserRepository> userRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert userRepositoryProvider != null;
    this.userRepositoryProvider = userRepositoryProvider;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
  }

  @Override
  public GetUserList get() {  
    GetUserList instance = new GetUserList(userRepositoryProvider.get(), threadExecutorProvider.get(), postExecutionThreadProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<GetUserList> create(MembersInjector<GetUserList> membersInjector, Provider<UserRepository> userRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider) {  
    return new GetUserList_Factory(membersInjector, userRepositoryProvider, threadExecutorProvider, postExecutionThreadProvider);
  }
}

