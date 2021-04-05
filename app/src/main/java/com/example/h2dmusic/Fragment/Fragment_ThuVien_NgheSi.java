package com.example.h2dmusic.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.h2dmusic.Adapter.NgheSiAdapter;
import com.example.h2dmusic.Adapter.PlaylistAdapter;
import com.example.h2dmusic.Adapter.ThuVienNgheSiAdapter;
import com.example.h2dmusic.Model.NgheSi;
import com.example.h2dmusic.Model.Playlist;
import com.example.h2dmusic.R;
import com.example.h2dmusic.Service.APIService;
import com.example.h2dmusic.Service.Dataservice;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_ThuVien_NgheSi  extends Fragment {

    View view;
    ThuVienNgheSiAdapter thuVienNgheSiAdapter;
    RecyclerView recyclerViewNgheSi;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_thuvien_nghesi, container, false);
        recyclerViewNgheSi = view.findViewById(R.id.recyclerviewnthuvienghesi);
        GetData();
        return view;
    }

    private void GetData() {
        Dataservice dataservice = APIService.getService();
        Call<List<NgheSi>> callback = dataservice.GetNgheSiCurrent();
        callback.enqueue(new Callback<List<NgheSi>>() {
            @Override
            public void onResponse(Call<List<NgheSi>> call, Response<List<NgheSi>> response) {
                ArrayList<NgheSi> mangnghesi = (ArrayList<NgheSi>) response.body();
                thuVienNgheSiAdapter = new ThuVienNgheSiAdapter(getActivity(), mangnghesi);

                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
                linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerViewNgheSi.setLayoutManager(linearLayoutManager);
                recyclerViewNgheSi.setAdapter(thuVienNgheSiAdapter);
            }

            @Override
            public void onFailure(Call<List<NgheSi>> call, Throwable t) {

            }

        });
    }

}
