package com.wenping.domain.interactor;

import com.wenping.domain.executor.PostExecutionThread;
import com.wenping.domain.executor.ThreadExecutor;
import com.wenping.domain.repository.UserRepository;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class GetUserDetails_Factory implements Factory<GetUserDetails> {
  private final MembersInjector<GetUserDetails> membersInjector;
  private final Provider<Integer> userIdProvider;
  private final Provider<UserRepository> userRepositoryProvider;
  private final Provider<ThreadExecutor> threadExecutorProvider;
  private final Provider<PostExecutionThread> postExecutionThreadProvider;

  public GetUserDetails_Factory(MembersInjector<GetUserDetails> membersInjector, Provider<Integer> userIdProvider, Provider<UserRepository> userRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
    assert userIdProvider != null;
    this.userIdProvider = userIdProvider;
    assert userRepositoryProvider != null;
    this.userRepositoryProvider = userRepositoryProvider;
    assert threadExecutorProvider != null;
    this.threadExecutorProvider = threadExecutorProvider;
    assert postExecutionThreadProvider != null;
    this.postExecutionThreadProvider = postExecutionThreadProvider;
  }

  @Override
  public GetUserDetails get() {  
    GetUserDetails instance = new GetUserDetails(userIdProvider.get(), userRepositoryProvider.get(), threadExecutorProvider.get(), postExecutionThreadProvider.get());
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<GetUserDetails> create(MembersInjector<GetUserDetails> membersInjector, Provider<Integer> userIdProvider, Provider<UserRepository> userRepositoryProvider, Provider<ThreadExecutor> threadExecutorProvider, Provider<PostExecutionThread> postExecutionThreadProvider) {  
    return new GetUserDetails_Factory(membersInjector, userIdProvider, userRepositoryProvider, threadExecutorProvider, postExecutionThreadProvider);
  }
}

