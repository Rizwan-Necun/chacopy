package com.example.chaquopy.databinding;
import com.example.chaquopy.R;
import com.example.chaquopy.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainActivityDataBindingImpl extends MainActivityDataBinding implements com.example.chaquopy.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_nine, 10);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainActivityDataBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private MainActivityDataBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.Button) bindings[9]
            );
        this.imageEight.setTag(null);
        this.imageFive.setTag(null);
        this.imageFour.setTag(null);
        this.imageOne.setTag(null);
        this.imageSeven.setTag(null);
        this.imageSix.setTag(null);
        this.imageThree.setTag(null);
        this.imageTwo.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.selectImageButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.example.chaquopy.generated.callback.OnClickListener(this, 9);
        mCallback7 = new com.example.chaquopy.generated.callback.OnClickListener(this, 7);
        mCallback8 = new com.example.chaquopy.generated.callback.OnClickListener(this, 8);
        mCallback5 = new com.example.chaquopy.generated.callback.OnClickListener(this, 5);
        mCallback6 = new com.example.chaquopy.generated.callback.OnClickListener(this, 6);
        mCallback3 = new com.example.chaquopy.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.example.chaquopy.generated.callback.OnClickListener(this, 4);
        mCallback1 = new com.example.chaquopy.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.chaquopy.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.chaquopy.MainActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.chaquopy.MainActivityViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.chaquopy.MainActivityViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.imageEight.setOnClickListener(mCallback8);
            this.imageFive.setOnClickListener(mCallback5);
            this.imageFour.setOnClickListener(mCallback4);
            this.imageOne.setOnClickListener(mCallback1);
            this.imageSeven.setOnClickListener(mCallback7);
            this.imageSix.setOnClickListener(mCallback6);
            this.imageThree.setOnClickListener(mCallback3);
            this.imageTwo.setOnClickListener(mCallback2);
            this.selectImageButton.setOnClickListener(mCallback9);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 9: {
                // localize variables for thread safety
                // viewModel
                com.example.chaquopy.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    if ((callbackArg_0) != (null)) {


                        callbackArg_0.getId();

                        viewModel.onresorceClick(callbackArg_0.getId());
                    }
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                com.example.chaquopy.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    if ((callbackArg_0) != (null)) {


                        callbackArg_0.getId();

                        viewModel.onresorceClick(callbackArg_0.getId());
                    }
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                com.example.chaquopy.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    if ((callbackArg_0) != (null)) {


                        callbackArg_0.getId();

                        viewModel.onresorceClick(callbackArg_0.getId());
                    }
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.example.chaquopy.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    if ((callbackArg_0) != (null)) {


                        callbackArg_0.getId();

                        viewModel.onresorceClick(callbackArg_0.getId());
                    }
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.example.chaquopy.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    if ((callbackArg_0) != (null)) {


                        callbackArg_0.getId();

                        viewModel.onresorceClick(callbackArg_0.getId());
                    }
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.chaquopy.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    if ((callbackArg_0) != (null)) {


                        callbackArg_0.getId();

                        viewModel.onresorceClick(callbackArg_0.getId());
                    }
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.chaquopy.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    if ((callbackArg_0) != (null)) {


                        callbackArg_0.getId();

                        viewModel.onresorceClick(callbackArg_0.getId());
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.chaquopy.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    if ((callbackArg_0) != (null)) {


                        callbackArg_0.getId();

                        viewModel.onresorceClick(callbackArg_0.getId());
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.chaquopy.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    if ((callbackArg_0) != (null)) {


                        callbackArg_0.getId();

                        viewModel.onresorceClick(callbackArg_0.getId());
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}