package com.heydoctor.app.service.question;

import com.heydoctor.app.dao.QuestionDAO;
import com.heydoctor.app.domain.dto.QuestionDTO;
import com.heydoctor.app.domain.vo.QuestionVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Qualifier("question") @Primary
public class QuestionServiceImpl implements QuestionService {
    private final QuestionDAO questionDAO;

    @Override
    public List<QuestionVO> getList(Integer page) {
        return questionDAO.findAll(page);
    }

    @Override
    public Optional<QuestionDTO> read(Long questionId) {
        return questionDAO.findById(questionId);
    }

    @Override
    public void write(QuestionVO questionVO) {
        questionDAO.setQuestionVO(questionVO);
    }
}