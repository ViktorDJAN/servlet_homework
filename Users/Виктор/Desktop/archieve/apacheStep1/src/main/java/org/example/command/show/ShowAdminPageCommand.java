package org.example.command.show;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.command.Command;
import org.example.result.ForwardResult;
import org.example.result.Result;

import static org.example.Resources.PAGE_ADMIN;

public class ShowAdminPageCommand implements Command {
    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response) {
        return new ForwardResult(PAGE_ADMIN );
    }
}
