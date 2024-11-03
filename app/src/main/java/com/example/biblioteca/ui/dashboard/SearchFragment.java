package com.example.biblioteca.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.biblioteca.databinding.FragmentSearchBinding;

public class SearchFragment extends Fragment {

    private FragmentSearchBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BusquedaVista busquedaVista = new ViewModelProvider(this).get(BusquedaVista.class);

        binding = FragmentSearchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.navigationSearch;
        busquedaVista.getText().observe(getViewLifecycleOwner(), textView::setText);

        SearchView searchView = binding.searchView;
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Manejar la búsqueda cuando se envía el texto
                textView.setText("Buscando: " + query);
                searchView.clearFocus(); // Opcional: limpiar el foco después de la búsqueda
                return true; // Indica que el evento ha sido manejado
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (!newText.isEmpty()) {
                    textView.setText("Buscando: " + newText); // Actualiza el texto mientras se escribe
                } else {
                    textView.setText(""); // Limpiar el texto si no hay entrada
                }
                return true;
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
