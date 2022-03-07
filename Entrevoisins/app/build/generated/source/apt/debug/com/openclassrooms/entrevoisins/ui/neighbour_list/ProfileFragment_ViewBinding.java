// Generated code from Butter Knife. Do not modify!
package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.openclassrooms.entrevoisins.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ProfileFragment_ViewBinding implements Unbinder {
  private ProfileFragment target;

  @UiThread
  public ProfileFragment_ViewBinding(ProfileFragment target, View source) {
    this.target = target;

    target.profile_name = Utils.findRequiredViewAsType(source, R.id.profile_name, "field 'profile_name'", TextView.class);
    target.picture = Utils.findRequiredViewAsType(source, R.id.profile_picture, "field 'picture'", ImageView.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.info_name, "field 'name'", TextView.class);
    target.social = Utils.findRequiredViewAsType(source, R.id.info_fb, "field 'social'", TextView.class);
    target.fab_favorite = Utils.findRequiredViewAsType(source, R.id.profile_favorite, "field 'fab_favorite'", FloatingActionButton.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.profile_return, "field 'back'", ImageView.class);
    target.adresse = Utils.findRequiredViewAsType(source, R.id.info_location, "field 'adresse'", TextView.class);
    target.phone = Utils.findRequiredViewAsType(source, R.id.info_tel, "field 'phone'", TextView.class);
    target.about = Utils.findRequiredViewAsType(source, R.id.describe, "field 'about'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ProfileFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.profile_name = null;
    target.picture = null;
    target.name = null;
    target.social = null;
    target.fab_favorite = null;
    target.back = null;
    target.adresse = null;
    target.phone = null;
    target.about = null;
  }
}
