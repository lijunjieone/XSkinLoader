package com.wind.me.xskinloader.skinDeployer;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.wind.me.xskinloader.SkinResDeployerFactory;
import com.wind.me.xskinloader.entity.SkinAttr;
import com.wind.me.xskinloader.entity.SkinConfig;
import com.wind.me.xskinloader.skinInterface.ISkinResDeployer;
import com.wind.me.xskinloader.skinInterface.ISkinResourceManager;

/**
 * Created by Windy on 2018/1/10.
 */

public class LayoutHeightResDeployer implements ISkinResDeployer {
    @Override
    public void deploy(View view, SkinAttr skinAttr, ISkinResourceManager resource) {
        if(SkinConfig.RES_TYPE_NAME_DIMEN.equals(skinAttr.attrValueTypeName) || SkinResDeployerFactory.LAYOUT_HEIGHT.equals(skinAttr.attrValueTypeName)){
//            view.setBackgroundColor(resource.getColor(skinAttr.attrValueRefId));
            view.setBackgroundColor(Color.RED);
//            if(view instanceof FrameLayout) {
                int dimen = resource.getDimen(skinAttr.attrValueRefId);
                ViewGroup.LayoutParams lp =new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,dimen);
                if(view.getLayoutParams()!=null) {
                    lp = (ViewGroup.LayoutParams) view.getLayoutParams();
                    lp.height = dimen;
                }
                view.setLayoutParams(lp);
//            }

        }
    }
}
