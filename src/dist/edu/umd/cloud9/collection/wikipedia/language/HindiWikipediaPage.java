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
 * A Hindi page from Wikipedia.
 *
 * @author Gaurav Ragtah
 * @author Nemanja Spasojevic
 */
public class HindiWikipediaPage extends GenericWikipediaPage {
  /**
   * Language dependent identifiers of disambiguation, redirection, and stub pages.
   */
  private static final String[] LOWER_CASED_REDIRECTS = {
      "#\u092A\u0941\u0928\u0930\u094D\u092A\u094D\u0930\u0947\u0937\u093F\u0924",
      "#\u0905\u0928\u0941\u092A\u094D\u0930\u0947\u0937\u093F\u0924"};
  private static final String DISAMB_PATTERN = "\\{\\{\u092C\u0939\u0941\u0935\u093F\u0915\u0932\u094D\u092A\u0940 \u0936\u092C\u094D\u0926\\}\\}";
  private static final String LANGUAGE_CODE = "hi";

  /**
   * Creates an empty <code>HindiWikipediaPage</code> object.
   */
  public HindiWikipediaPage() {
    super(LANGUAGE_CODE, LOWER_CASED_REDIRECTS,DISAMB_PATTERN);
  }
}
