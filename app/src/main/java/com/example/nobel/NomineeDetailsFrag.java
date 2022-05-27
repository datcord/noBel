package com.example.nobel;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class NomineeDetailsFrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String[] NOMINEE_INFO = {
        "Benjamin List (German pronunciation: [ˈbɛnjamiːn ˈlɪst] (listen); born 11 January 1968) is a German chemist who is one of the directors of the Max Planck Institute for Coal Research and professor of organic chemistry at the University of Cologne. He co-developed organocatalysis, a method of accelerating chemical reactions and making them more efficient. He shared the 2021 Nobel Prize in Chemistry with David MacMillan \"for the development of asymmetric organocatalysis\".",
        "Syukuro \"Suki\" Manabe (真鍋 淑郎, Manabe Shukurō, born 21 September 1931) is a Japanese-educated American meteorologist and climatologist who pioneered the use of computers to simulate global climate change and natural climate variations. He was awarded the 2021 Nobel Prize in Physics jointly with Klaus Hasselmann and Giorgio Parisi, for his contributions to the physical modeling of earth's climate, quantifying its variability, and predictions of climate change.",
        "Maria Angelita Ressa (Tagalog pronunciation: [ˈɾesa], born on October 2, 1963) is a Filipino-American journalist and author, the co-founder and CEO of Rappler, and the first Filipino recipient of the Nobel Peace Prize. She previously spent nearly two decades working as a lead investigative reporter in Southeast Asia for CNN She was also convicted by cyber libel.\n" +
        "\n Ressa was included in Time's Person of the Year 2018 issue as one of a collection of journalists from around the world combating fake news. On February 13, 2019, she was arrested by Philippine authorities for cyberlibel due to accusations that Rappler published a false news story concerning businessman Wilfredo Keng. On June 15, 2020, a court in Manila found her guilty of cyberlibel under the controversial Anti-Cybercrime law, a move condemned by human rights groups and journalists as an attack on press freedom. As she is a prominent critic of Philippine President Rodrigo Duterte, her arrest and conviction was seen by many in the opposition and the international community as a politically motivated act by Duterte's government. Ressa is one of the 25 leading figures on the Information and Democracy Commission launched by Reporters Without Borders. She was awarded the 2021 Nobel Peace Prize jointly with Dmitry Muratov for \"their efforts to safeguard freedom of expression, which is a precondition for democracy and lasting peace.",
        "Abdulrazak Gurnah FRSL (born 20 December 1948) is a Tanzanian-born British novelist and academic. He was born in the Sultanate of Zanzibar and moved to the United Kingdom in the 1960s as a refugee during the Zanzibar Revolution.[1] His novels include Paradise (1994), which was shortlisted for both the Booker and the Whitbread Prize; Desertion (2005); and By the Sea (2001), which was longlisted for the Booker and shortlisted for the Los Angeles Times Book Prize.\nGurnah was awarded the Nobel Prize in Literature in 2021 \"for his uncompromising and compassionate penetration of the effects of colonialism and the fates of the refugee in the gulf between cultures and continents\". He is Emeritus Professor of English and Postcolonial Literatures at the University of Kent."
    };

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Intent intent = getActivity().getIntent();
        int id = intent.getIntExtra("country_id",R.id.chemistry);
        setNomineeId(id);
    }

    public NomineeDetailsFrag() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nominee_details, container, false);
    }

    public void setNomineeId(int id) {
        TextView info = (TextView) getActivity().findViewById(R.id.details);
        ImageView image = (ImageView) getActivity().findViewById(R.id.profile);
        switch (id){
            case R.id.chemistry:
                info.setText(NOMINEE_INFO[0]);
                image.setImageResource(R.drawable.chemistry);
                break;
            case R.id.physics:
                info.setText(NOMINEE_INFO[1]);
                image.setImageResource(R.drawable.physics);
                break;
            case R.id.peace:
                info.setText(NOMINEE_INFO[2]);
                image.setImageResource(R.drawable.peace);
                break;
            case R.id.literature:
                info.setText(NOMINEE_INFO[3]);
                image.setImageResource(R.drawable.literature);
                break;

        }
    }
}