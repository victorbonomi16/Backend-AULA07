package com.example.Exercicio04;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;

    @PostMapping
    public Playlist criarPlaylist(@RequestBody Playlist playlist) {
        return playlistService.criarPlaylist(playlist);
    }

    @PostMapping("/{id}/musicas")
    public String adicionarMusica(@PathVariable int id, @RequestBody Musica musica) {
        playlistService.adicionarMusica(id, musica);
        return "Música adicionada com sucesso!";
    }

    @GetMapping
    public List<Playlist> listarPlaylists() {
        return playlistService.listarPlaylists();
    }

    @GetMapping("/{id}/musicas")
    public List<Musica> listarMusicas(@PathVariable int id) {
        return playlistService.listarMusicasDaPlaylist(id);
    }
}

