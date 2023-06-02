package com.adiljamal.android_emr.ui.news;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.adiljamal.android_emr.NewsDescriptionActivity;
import com.adiljamal.android_emr.OnItemClickListener;
import com.adiljamal.android_emr.R;
import com.adiljamal.android_emr.databinding.FragmentNewsBinding;
import com.adiljamal.android_emr.ui.home.history.cronics.ChronicDiseasesAdapter;
import com.adiljamal.android_emr.ui.home.history.cronics.CronicsActivity;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends Fragment {

    private List<News> newsList = new ArrayList<>();
    private FragmentNewsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentNewsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        newsList.add(new News("Fístula obstétrica afecta mais de quatro mil mulheres por ano no país",
                R.drawable.cirurgianews, "Pelo menos quatro mil mulheres contraem a fístula obstétrica, por ano, no país. Os casos da doença tendem a aumentar e o médico especialista, Igor Vaz, fala da necessidade de reforçar o sistema de saúde, nas zonas recônditas, para que haja mais partos seguros.\n" +
                "\n" +
                "Fístula obstétrica é uma complicação grave que ocorre durante o parto, caracterizada por ruptura no tecido que separa a bexiga do aparelho reprodutor feminino, o que faz com que a mulher passe a urinar ou mesmo defecar descontroladamente, o que leva ao estigma e à discriminação.\n" +
                "\n" +
                "De um parto aparentemente normal, Maria Joaquina, nome fictício, natural de Massinga, na província de Inhambane, de 19 anos de idade, teve sequelas indisfarçáveis.\n" +
                "\n" +
                "“Eu sempre acordava molhada. Quando ia à casa de banho, apercebia-me de que depois ficava toda molhada, e não era água, era urina”, contou a jovem que perdeu o seu bebé no parto, e desde então, ela, a mãe, começou a usar fraldas descartáveis, por não conseguir controlar a sua urina.\n" +
                "\n" +
                "Uma doença que surge após partos demorados ou obstruções para dar à luz, segundo explicou Igor Vaz, médico especialista.\n" +
                "\n" +
                "“Quando o bebé sai da cavidade uterina para o exterior, passa pelo canal vaginal. Quando sai rápido pode lacerar alguns tecidos. Se ele ficar muito tempo no canal de parto, a cabeça do bebé comprime o tecido da pélvis feminina contra os ossos. Estes tecidos perdem a circulação e acabam por morrer. A partir daí, começa a haver perda de urina, de fezes, ou de ambos”, disse Igor Vaz.\n" +
                "\n" +
                "A fístula obstétrica ainda é desconhecida por muitas mulheres, que sofrem em silêncio.\n" +
                "\n" +
                "Há 12 anos, Josefa Luís, outra paciente, perdeu a capacidade de controlar as suas necessidades biológicas, logo após o nascimento do seu primeiro filho. Teve outros três e só em 2018, sete anos depois, soube que sofria de fístula obstétrica."));

        newsList.add(new News("Consumo de drogas tende a aumentar em adolescentes",R.drawable.drogas ,
                "O ministro da Saúde exige mais intervenção dos pais e encarregados de educação no combate ao consumo de drogas por parte de adolescentes e jovens. Armindo Tiago falava durante as celebrações do Dia Internacional contra Abuso de Drogas e Tráfico Ilícito, assinalado ontem.\n" +
                        "\n" +
                        "“Voltar a drogar-me não quero mais, porque aquilo que a droga me mostrou não quero para mim”.\n" +
                        "\n" +
                        "É o sentimento de quem viveu 16 anos a depender de drogas. Melito Dimas experimentou-as quando tinha 14 anos de idade. Ele conta que já conheceu o mundo obscuro, mostrado por aqueles que chamou de “falsos amigos”.\n" +
                        "\n" +
                        "Desde que iniciou a sua “empreitada”, já fumou, tomou e até injectou tipologias diversas de estupefacientes, cada um em função da necessidade, do desejo e do nível de dependência, mas o mais prejudicial: “quanto mais amizades ia conhecendo no mundo das drogas, novas drogas conhecia. Fui subindo para heroína, mas chegou um tempo em que aquela droga perdeu qualidade. Foi então que conheci o hiwhite e, depois, o thai, que não tinha boa qualidade, mas disseram-me que, injectado, dava mais ‘paulada’, por isso o experimentei”, Melito Dimas.\n" +
                        "\n" +
                        "Dimas contou que “cheguei até a ficar sem veias por onde injectar a droga, passando já a injectá-la nos tendões – partes impróprias –, mas, por causa da ressaca, já não tinha controlo. Injectava-a até no pescoço”.\n" +
                        "\n" +
                        "Nessa sua trajetória, a nossa fonte, um exemplo de superação, diz que perdeu família, amigos, escola e teve que abandonar a casa, pois, para alimentar o vício, tinha que vender alguns artigos da casa dos pais, mas “graças à ajuda de amigos e de algumas organizações, estou limpo há mais de um ano”.\n" +
                        "\n" +
                        "Em cada história contada por um antigo toxicodependente, a influência de amigos tem sido a principal causa para o consumo de drogas.\n" +
                        "\n" +
                        "“Aqueles amigos que te convidam para coisas aparentemente boas não são teus amigos de verdade, por isso eu apelo aos alunos, adolescentes e jovens para que nunca experimentem algo de que se vão arrepender amanhã”, disse Rodolfo João, antigo consumidor de drogas, que está “limpo” há mais de quatro anos, depois de 17 anos de toxicodependência.\n" +
                        "\n" +
                        "Para chamar atenção dos mais novos para a necessidade de se manterem longe das drogas, a Escola Secundária Francisco Manyanga acolheu, sexta-feira última, as celebrações centrais do Dia Internacional contra Abuso de Drogas e Tráfico Ilícito.\n" +
                        "\n" +
                        "Os adolescentes dão nota positiva à iniciativa, pois, tal como Philip Sidney, adolescente e aluno do ensino secundário, há muitos estudantes que se sentem ameaçados pelos colegas, que, depois de consumirem drogas, mudam de postura e viram marginais.\n" +
                        "\n" +
                        "“Aqui, na escola, bem como noutras [instituições de ensino], há cenários de roubos de celulares, lanche, ameaças a colegas, o que não nos deixa à vontade”, disse o aluno.\n" +
                        "\n" +
                        "Durante o evento, o representante da Organização das Nações Unidas contra Drogas e Crime (ONUDC) disse que a COVID-19 agudizou o consumo de drogas no mundo e Moçambique não foi excepção.\n" +
                        "\n" +
                        "“Os conflitos e catástrofes climáticos e a pobreza são, naturalmente, terreno fértil para o consumo de drogas. A COVID-19 veio agudizar ainda mais estas vulnerabilidades”, disse Mário Teixeira, em representação à ONUDC\n" +
                        "\n" +
                        "São estas e outras vulnerabilidades que contribuíram para o aumento do número de adolescentes que se perdem no mundo das drogas, conforme informou o Ministro da Saúde.\n" +
                        "\n" +
                        "“A prevalência do consumo de droga e outras substâncias psicoactivas é mais expressiva entre os homens e no grupo etário de 21-30 anos de idade, e menos na população adulta com mais de 40 anos. No nosso país, no entanto, temos vindo a notar, com muita preocupação, que a idade de início do consumo de drogas tem estado a baixar, principalmente, do consumo de cannabis sativa, vulgo soruma”."));


        binding.newsRV.setLayoutManager(new LinearLayoutManager(getContext()));

        NewsAdapter adapter = new NewsAdapter(getContext(),newsList);
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                News news = newsList.get(position);

                Intent it = new Intent(getContext(), NewsDescriptionActivity.class);
                it.putExtra("title", news.getTitle());
                it.putExtra("desc", news.getDescription());
                it.putExtra("img", news.getImage());

                startActivity(it);

            }
        });

        binding.newsRV.setAdapter(adapter);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}