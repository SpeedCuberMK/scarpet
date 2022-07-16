__config() -> {
    'stay_loaded' -> true,
};

__command() ->
(
    run('/player BedBot spawn at -840.49 9.13 -171.43 facing -180.52 6.31 in minecraft:overworld');
    run('player BedBot sneak');
    run('player BedBot use interval 80');
);