package id.ukdw.srmmobile.ui.base;

import android.content.Context;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.ViewModel;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;

import java.lang.ref.WeakReference;

import id.ukdw.srmmobile.data.DataManager;
import id.ukdw.srmmobile.utils.rx.SchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Project: srmmobile
 * Package: id.ukdw.srmmobile.views.base
 * <p>
 * User: dendy
 * Date: 29/08/2020
 * Time: 16:26
 * <p>
 * Description : BaseViewModel
 */
public abstract class BaseViewModel<N> extends ViewModel {

    private final DataManager mDataManager;

    private final ObservableBoolean mIsLoading = new ObservableBoolean();

    private final SchedulerProvider mSchedulerProvider;

    private final GoogleSignInClient googleSignInClient;

    private CompositeDisposable mCompositeDisposable;

    private WeakReference<N> mNavigator;

    private WeakReference<Context> mContext;

    public BaseViewModel(DataManager dataManager,
                         SchedulerProvider schedulerProvider,
                         GoogleSignInClient googleSignInClient) {
        this.mDataManager = dataManager;
        this.mSchedulerProvider = schedulerProvider;
        this.mCompositeDisposable = new CompositeDisposable();
        this.googleSignInClient = googleSignInClient;
    }

    @Override
    protected void onCleared() {
        mCompositeDisposable.dispose();
        super.onCleared();
    }

    public CompositeDisposable getCompositeDisposable() {
        return mCompositeDisposable;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }

    public GoogleSignInClient getGoogleSignInClient() {
        return googleSignInClient;
    }

    public ObservableBoolean getIsLoading() {
        return mIsLoading;
    }

    public void setIsLoading(boolean isLoading) {
        mIsLoading.set(isLoading);
    }

    public N getNavigator() {
        return mNavigator.get();
    }

    public void setNavigator(N navigator) {
        this.mNavigator = new WeakReference<>(navigator);
    }

    public Context getContext() {
        return mContext.get();
    }

    public void setContext(Context context) {
        this.mContext = new WeakReference<>(context);
    }

    public SchedulerProvider getSchedulerProvider() {
        return mSchedulerProvider;
    }
}
