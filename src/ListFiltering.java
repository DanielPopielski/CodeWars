import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {

    public List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(obj -> obj instanceof Integer)
                .collect(Collectors.toList());
    }
}
