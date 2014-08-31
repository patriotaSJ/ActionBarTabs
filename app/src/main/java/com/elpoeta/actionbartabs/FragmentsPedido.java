package com.elpoeta.actionbartabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by user on 24/08/2014.
 */
public class FragmentsPedido extends Fragment {

    View rootView;
    Button btnPedido;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fm_pedido,container, false );

        btnPedido = (Button) rootView.findViewById(R.id.btnPedido);
        btnPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "texto de pedido", Toast.LENGTH_SHORT ).show();
            }
        });

        return rootView;
    }
}
