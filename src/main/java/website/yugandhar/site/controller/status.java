package website.yugandhar.site.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
public class status {

    @RequestMapping("/status")
    public String statusCheck() {


        return "ok";
    }


    public static void main(String ar[]) {
        int[][] r = {
                {1, 2},
                {3, 4}
        };
        int colIndex = 1;
        Integer[] col = Arrays.stream(r).map(arr -> arr[colIndex]).toArray(size -> new Integer[size]);
      //  Integer[] col = Arrays.asList(r).stream().map(arr -> arr[colIndex]).toArray(size -> new Integer[size]);
        //col data
        for (Integer integer : col) {
            System.out.println(integer);
        }
    }
}
