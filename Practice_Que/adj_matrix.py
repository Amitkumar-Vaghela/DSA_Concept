def create_adjacency_matrix(graph):
    num_nodes = len(graph)
    adj_matrix = [[0] * num_nodes for _ in range(num_nodes)] 

    for node, neighbors in graph.items():
        for neighbor in neighbors:
            adj_matrix[node][neighbor] = 1  

    return adj_matrix

def print_adjacency_matrix(adj_matrix):
    for row in adj_matrix:
        print(row)

if __name__ == "__main__":
   
    graph = {
        0: [1, 2],
        1: [0, 2, 3, 4],
        2: [0, 1, 3, 4],
        3: [1, 2, 4],
        4: [1, 2, 3]
    }
    adj_matrix = create_adjacency_matrix(graph)
    print("Adjacency Matrix:")
    print_adjacency_matrix(adj_matrix)
