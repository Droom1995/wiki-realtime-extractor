package org.dbpedia.extractor.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class ParsedPage {
    private List<String> paragraphs;

    private List<Position> links;

    /**
     * Page structure: topics, subtopics, etc.
     */
    private Subdivision structureRoot;

    private WikiPage wikiPage;
}
