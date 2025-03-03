package io.grpc.examples.helloworld;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.Metadata;
import io.grpc.Status;
import java.io.OutputStream;
import java.lang.Exception;
import java.lang.RuntimeException;
import java.lang.Void;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.rere.core.serde.PrimitiveSerde;
import org.rere.external.grpc.serializers.MetadataSerde;
import org.rere.external.grpc.serializers.StatusSerde;

public class HelloWorldClientMock {
  private static final PrimitiveSerde defaultSerde = new PrimitiveSerde();

  public static OutputStream environmentNode2() throws Exception {
    OutputStream mockObject = mock(OutputStream.class);
    doNothing().when(mockObject).write(any(), anyInt(), anyInt());
    return mockObject;
  }

  public static Answer<Void> getAnswer0() {
    return (InvocationOnMock invocation) -> {
      HelloRequest param0 = invocation.getArgument(0);
      param0.getSerializedSize();
      param0.getSerializedSize();
      OutputStream envParam0 = environmentNode2();
      param0.writeTo(envParam0);
      return null;
    } ;
  }

  public static Metadata environmentNode3() throws Exception {
    // Metadata(content-type=application/grpc,grpc-encoding=identity,grpc-accept-encoding=gzip)
    return (Metadata) new MetadataSerde().deserialize("rO0ABXNyABFqYXZhLnV0aWwuSGFzaE1hcAUH2sHDFmDRAwACRgAKbG9hZEZhY3RvckkACXRocmVzaG9sZHhwP0AAAAAAAAx3CAAAABAAAAADdAAUZ3JwYy1hY2NlcHQtZW5jb2Rpbmd0AARnemlwdAAMY29udGVudC10eXBldAAQYXBwbGljYXRpb24vZ3JwY3QADWdycGMtZW5jb2Rpbmd0AAhpZGVudGl0eXg=");
  }

  public static HelloReply environmentNode4() throws Exception {
    /*
     * message: "Hello world"
    */
    return (HelloReply) defaultSerde.deserialize("rO0ABXNyADdjb20uZ29vZ2xlLnByb3RvYnVmLkdlbmVyYXRlZE1lc3NhZ2VMaXRlJFNlcmlhbGl6ZWRGb3JtAAAAAAAAAAACAANbAAdhc0J5dGVzdAACW0JMAAxtZXNzYWdlQ2xhc3N0ABFMamF2YS9sYW5nL0NsYXNzO0wAEG1lc3NhZ2VDbGFzc05hbWV0ABJMamF2YS9sYW5nL1N0cmluZzt4cHVyAAJbQqzzF/gGCFTgAgAAeHAAAAANCgtIZWxsbyB3b3JsZHZyACZpby5ncnBjLmV4YW1wbGVzLmhlbGxvd29ybGQuSGVsbG9SZXBseQAAAAAAAAAAAgACQgAVbWVtb2l6ZWRJc0luaXRpYWxpemVkTAAIbWVzc2FnZV90ABJMamF2YS9sYW5nL09iamVjdDt4cgAmY29tLmdvb2dsZS5wcm90b2J1Zi5HZW5lcmF0ZWRNZXNzYWdlVjMAAAAAAAAAAQIAAUwADXVua25vd25GaWVsZHN0ACVMY29tL2dvb2dsZS9wcm90b2J1Zi9Vbmtub3duRmllbGRTZXQ7eHB0ACZpby5ncnBjLmV4YW1wbGVzLmhlbGxvd29ybGQuSGVsbG9SZXBseQ==");
  }

  public static Status environmentNode5() throws Exception {
    // Status{code=OK, description=null, cause=null}
    return (Status) new StatusSerde().deserialize("rO0ABXNyADlvcmcucmVyZS5leHRlcm5hbC5ncnBjLnNlcmlhbGl6ZXJzLlN0YXR1c1NlcmRlJFN0YXR1c1dyYXBkUa91GQWH5gIAA0wABWNhdXNldAAVTGphdmEvbGFuZy9UaHJvd2FibGU7TAAEY29kZXQAFUxpby9ncnBjL1N0YXR1cyRDb2RlO0wAC2Rlc2NyaXB0aW9udAASTGphdmEvbGFuZy9TdHJpbmc7eHBwfnIAE2lvLmdycGMuU3RhdHVzJENvZGUAAAAAAAAAABIAAHhyAA5qYXZhLmxhbmcuRW51bQAAAAAAAAAAEgAAeHB0AAJPS3A=");
  }

  public static Metadata environmentNode6() throws Exception {
    // Metadata()
    return (Metadata) new MetadataSerde().deserialize("rO0ABXNyABFqYXZhLnV0aWwuSGFzaE1hcAUH2sHDFmDRAwACRgAKbG9hZEZhY3RvckkACXRocmVzaG9sZHhwP0AAAAAAAAB3CAAAABAAAAAAeA==");
  }

  public static Answer<Void> getAnswer1() {
    return (InvocationOnMock invocation) -> {
      ClientCall.Listener param0 = invocation.getArgument(0);
      // Failed node
      /*
       * ReRe cannot spy on final class: class io.grpc.Metadata
       * Further method tracing maybe incorrect on this object.
       * If this is a environment object, consider using custom serialization.
      */
      Metadata param1 = invocation.getArgument(1);
      Metadata envParam1 = environmentNode3();
      param0.onHeaders(envParam1);
      HelloReply envParam2 = environmentNode4();
      param0.onMessage(envParam2);
      Status envParam3 = environmentNode5();
      Metadata envParam4 = environmentNode6();
      param0.onClose(envParam3, envParam4);
      return null;
    } ;
  }

  public static ClientCall environmentNode1() throws Exception {
    ClientCall mockObject = mock(ClientCall.class);
    doNothing().when(mockObject).request(anyInt());
    doNothing().when(mockObject).halfClose();
    doAnswer(getAnswer0()).when(mockObject).sendMessage(any());
    doAnswer(getAnswer1()).when(mockObject).start(any(), any());
    return mockObject;
  }

  public static Channel environmentNode0() throws Exception {
    Channel mockObject = mock(Channel.class);
    ClientCall local0 = environmentNode1();
    doReturn(local0).when(mockObject).newCall(any(), any());
    return mockObject;
  }

  public static Channel create() {
    try {
      return environmentNode0();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
