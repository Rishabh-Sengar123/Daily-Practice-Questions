# Last updated: 8/3/2025, 9:54:10 AM
defmodule Solution do
  def find_redundant_directed_connection(edges) do
    n = length(edges)
    parent = Map.new(1..n, fn i -> {i, i} end)

    {cand1, cand2, updated_edges, final_parent} =
      Enum.reduce(edges, {nil, nil, [], parent}, fn [u, v] = edge, {c1, c2, acc, pmap} ->
        if Map.get(pmap, v) != v do
          # Node has two parents
          {[Map.get(pmap, v), v], edge, acc ++ [[u, 0]], pmap}
        else
          {c1, c2, acc ++ [edge], Map.put(pmap, v, u)}
        end
      end)

    roots = Enum.reduce(1..n, %{}, fn i, acc -> Map.put(acc, i, i) end)

    {cycle_edge, _} =
      Enum.reduce_while(updated_edges, {nil, roots}, fn [u, v], {found, rmap} ->
        if v == 0 do
          {:cont, {found, rmap}}
        else
          {pu, rmap1} = find(rmap, u)
          {pv, rmap2} = find(rmap1, v)

          if pu == pv do
            {:halt, {[u, v], rmap2}}
          else
            {:cont, {found, Map.put(rmap2, v, pu)}}
          end
        end
      end)

    cond do
      cand1 == nil -> cycle_edge
      cycle_edge != nil -> cand1
      true -> cand2
    end
  end

  defp find(map, u) do
    if map[u] != u do
      {res, new_map} = find(map, map[u])
      {res, Map.put(new_map, u, res)}
    else
      {u, map}
    end
  end
end
