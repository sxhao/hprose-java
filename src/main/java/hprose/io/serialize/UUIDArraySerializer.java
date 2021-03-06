/**********************************************************\
|                                                          |
|                          hprose                          |
|                                                          |
| Official WebSite: http://www.hprose.com/                 |
|                   http://www.hprose.org/                 |
|                                                          |
\**********************************************************/
/**********************************************************\
 *                                                        *
 * UUIDArraySerializer.java                               *
 *                                                        *
 * UUID array serializer class for Java.                  *
 *                                                        *
 * LastModified: Sep 15, 2014                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/

package hprose.io.serialize;

import hprose.io.HproseWriter;
import java.io.IOException;
import java.util.UUID;

final class UUIDArraySerializer implements HproseSerializer<UUID[]> {

    public final static HproseSerializer instance = new UUIDArraySerializer();

    public void write(HproseWriter writer, UUID[] obj) throws IOException {
        writer.writeArrayWithRef(obj);
    }
}
