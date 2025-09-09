package com.example.Exercicio04;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PlaylistService {
    private final Map<Integer, Playlist> playlists = new HashMap<>();
    private int proximoId = 1;

    public Playlist criarPlaylist(Playlist playlist) {
        playlist.setId(proximoId++);
        playlists.put(playlist.getId(), playlist);
        return playlist;
    }

    public List<Playlist> listarPlaylists() {
        return new ArrayList<>(playlists.values());
    }

    public Playlist getPlaylistPorId(int id) {
        return playlists.get(id);
    }

    public void adicionarMusica(int playlistId, Musica musica) {
        Playlist playlist = playlists.get(playlistId);
        if (playlist != null) {
            playlist.adicionarMusica(musica);
        }
    }

    public List<Musica> listarMusicasDaPlaylist(int id) {
        Playlist playlist = playlists.get(id);
        if (playlist != null) {
            return playlist.getMusicas();
        }
        return Collections.emptyList();
    }
}
