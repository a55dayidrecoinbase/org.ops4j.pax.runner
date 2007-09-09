/*
 * Copyright 2007 Alin Dreghiciu.
 *
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.runner.platform;

import java.io.File;

/**
 * A bundle reference in local file system.
 *
 * @author Alin Dreghiciu
 * @since August 20, 2007
 */
public interface LocalBundle
{

    /**
     * Returns the file corresponding to the bundle.
     *
     * @return an file
     */
    File getFile();

    /**
     * Returns the bundle reference this file is refering to.
     *
     * @return the bundle reference
     */
    BundleReference getBundleReference();

}
