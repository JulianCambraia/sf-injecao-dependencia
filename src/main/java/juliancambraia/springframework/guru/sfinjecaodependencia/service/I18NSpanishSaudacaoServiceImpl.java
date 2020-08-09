package juliancambraia.springframework.guru.sfinjecaodependencia.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"ES", "default"})
@Service("i18nService")
public class I18NSpanishSaudacaoServiceImpl implements SaudacaoService {
    @Override
    public String saudar() {
        return "i18n - ES";
    }
}
