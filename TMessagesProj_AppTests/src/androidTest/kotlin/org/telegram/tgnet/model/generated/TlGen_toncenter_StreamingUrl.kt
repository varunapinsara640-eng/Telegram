package org.wooble.tgnet.model.generated

import kotlin.Int
import kotlin.String
import kotlin.UInt
import org.wooble.tgnet.OutputSerializedData
import org.wooble.tgnet.model.TlGen_Object
import org.wooble.tgnet.model.TlGen_Vector

public sealed class TlGen_toncenter_StreamingUrl : TlGen_Object {
  public data class TL_toncenter_streamingUrl(
    public val url: String,
    public val expires: Int,
  ) : TlGen_toncenter_StreamingUrl() {
    public override fun serializeToStream(stream: OutputSerializedData) {
      stream.writeInt32(MAGIC.toInt())
      stream.writeString(url)
      stream.writeInt32(expires)
    }

    public companion object {
      public const val MAGIC: UInt = 0x19887601U
    }
  }
}
