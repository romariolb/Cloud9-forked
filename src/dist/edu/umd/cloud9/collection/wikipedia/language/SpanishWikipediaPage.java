/*
 * Cloud9: A MapReduce Library for Hadoop
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package edu.umd.cloud9.collection.wikipedia.language;

/**
 * An Spanish page from Wikipedia.
 *
 * @author Ferhan Ture
 * @author Nemanja Spasojevic
 */
public class SpanishWikipediaPage extends GenericWikipediaPage {
  /**
   * Language dependent identifiers of disambiguation, redirection, and stub pages.
   */
  private static final String[] LOWER_CASED_REDIRECTS = {"#redirección"};
  private static final String DISAMB_PATTERN = "\\{\\{desambiguaci\u00F3n\\}\\}";
  private static final String LANGUAGE_CODE = "es";

  /**
   * Creates an empty <code>SpanishWikipediaPage</code> object.
   */
  public SpanishWikipediaPage() {
    super(LANGUAGE_CODE, LOWER_CASED_REDIRECTS,DISAMB_PATTERN);
  }
}
